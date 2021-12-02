package subProj_791

import subProj_791.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_791")
    name = "subProj 791"

    buildType(subProj_bt_791_3)
    buildType(subProj_bt_791_4)
    buildType(subProj_bt_791_1)
    buildType(subProj_bt_791_2)
    buildType(subProj_bt_791_0)
    buildType(subProj_bt_791_5)
})
