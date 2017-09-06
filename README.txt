The folder contains the following documents:

1. Parsing-IPFIX-Messages-using-DFDL.pptx 

   This Powerpoint document describes what IPFIX is,
   what it is used for, its security risks, and then
   it describes in detail the IPFIX data format.

2. Issues-to-Address-when-Using-DFDL-to-Parse-IPFIX-messages.docx

   This Word document describes the need to dynamically
   generate the parser for IPFIX data records.

3. template-record.dfdl.xsd

   This is a DFDL schema for parsing IPFIX template records.

4. template-record.binary

   This is a sample IPFIX message containing a template record.

5. template-record.xml

   This XML is the result of parsing (4) using (3).

6. data-record.dfdl.xsd

   This is a DFDL schema for parsing IPFIX data records. The
   content of this data record is described by the template record
   in (3).

7. data-record.binary

   This is a sample IPFIX message containing a data record.

8. data-record.xml

   This XML is the result of parsing (7) using (6).


Roger Costello
May 7, 2015
