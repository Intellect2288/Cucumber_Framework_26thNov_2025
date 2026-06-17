package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<extentreports>
	<configuration>
	  <!-- report theme -->
	  <!-- STANDARD, DARK -->
	  <theme>STANDARD</theme>
	  <!-- document encoding -->
	  <!-- defaults to UTF-8 -->
	 
	  <encoding>UTF-8</encoding>
	  <!-- protocol for script and stylesheets -->
	  <!-- defaults to https -->
	  <!-- HTTP, HTTPS -->
	  <protocol>HTTPS</protocol>
	 
	  <!-- title of the document -->
	  <documentTitle>Intellect_Learner_Academy</documentTitle>
	 
	  <!-- report name - displayed at top-nav -->
	  <reportName>Swag_Lab</reportName>
	   <!-- top, bottom -->
	  <testViewChartLocation>top</testViewChartLocation>
	  <!-- custom javascript -->
	  <scripts>
	    <![CDATA[
	      $(document).ready(function() {
	        
	      });
	    ]]>
	  </scripts>
	  <!-- custom styles -->
	  <styles>
	    <![CDATA[
	  
	    ]]>
	  </styles>
	</configuration>
	</extentreports>
	
}

