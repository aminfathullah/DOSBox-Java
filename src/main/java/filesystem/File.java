/*
 * DOSBox, Scrum.org, Professional Scrum Developer Training
 * Authors: Rainer Grau, Daniel Tobler, Zuehlke Technology Group
 * Copyright (c) 2013 All Right Reserved
 */ 

package filesystem;

import java.sql.Timestamp;
import java.util.ArrayList;

/**This class implements the behavior of concrete files. 
 * Composite-Pattern: Leaf
 * 
 * Responsibilities:
 * - represents leaf objects in the composition. A leaf has no children. 
 * - defines behavior for primitive objects in the composition. 
 */
public class File extends FileSystemItem {
	private String fileContent;
        private Timestamp timestamp;

	/**Constructor.
	 * @param name A name for the file. Note that file names may not contain '\' '/' ':' ',' ';' and ' '.
	 * @param fileContent Any string which represents the content of the file.
	 *                    The content may not contain characters like ',' and ';'.
	 */
	public File(String name, String fileContent, Timestamp timestamp) {
		super(name, null, timestamp);
		this.fileContent = fileContent;
                this.timestamp = timestamp;
	}

	public String getFileContent() {
		return this.fileContent;
	}
        
        public Timestamp getTimeStamp() {
		return this.timestamp;
	}

	@Override
	public ArrayList<FileSystemItem> getContent() throws IllegalAccessException {
		throw new IllegalAccessException("File.Content called. Check first with IsDirectory()");
	}

	@Override
	public boolean isDirectory() {
		return false;
	}

	@Override
	public int getNumberOfContainedFiles() {
		return 0;  // A file does not contain any other files
	}

	@Override
	public int getNumberOfContainedDirectories() {
		return 0;  // A file does not contain any sub-directories
	}

	@Override
	public int getSize() {
		return fileContent.length();
	}
}
