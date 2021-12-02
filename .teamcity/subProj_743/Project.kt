package subProj_743

import subProj_743.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_743")
    name = "subProj 743"

    buildType(subProj_bt_743_2)
    buildType(subProj_bt_743_3)
    buildType(subProj_bt_743_4)
    buildType(subProj_bt_743_5)
    buildType(subProj_bt_743_0)
    buildType(subProj_bt_743_1)
})
