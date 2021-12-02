package subProj_1570

import subProj_1570.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1570")
    name = "subProj 1570"

    buildType(subProj_bt_1570_1)
    buildType(subProj_bt_1570_2)
    buildType(subProj_bt_1570_3)
    buildType(subProj_bt_1570_4)
    buildType(subProj_bt_1570_0)
    buildType(subProj_bt_1570_5)
})
