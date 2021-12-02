package subProj_1425

import subProj_1425.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1425")
    name = "subProj 1425"

    buildType(subProj_bt_1425_4)
    buildType(subProj_bt_1425_5)
    buildType(subProj_bt_1425_0)
    buildType(subProj_bt_1425_1)
    buildType(subProj_bt_1425_2)
    buildType(subProj_bt_1425_3)
})
