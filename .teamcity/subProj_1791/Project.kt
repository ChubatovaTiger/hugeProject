package subProj_1791

import subProj_1791.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1791")
    name = "subProj 1791"

    buildType(subProj_bt_1791_1)
    buildType(subProj_bt_1791_0)
    buildType(subProj_bt_1791_3)
    buildType(subProj_bt_1791_2)
    buildType(subProj_bt_1791_5)
    buildType(subProj_bt_1791_4)
})
