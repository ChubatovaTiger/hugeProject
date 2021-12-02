package subProj_1743

import subProj_1743.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1743")
    name = "subProj 1743"

    buildType(subProj_bt_1743_4)
    buildType(subProj_bt_1743_3)
    buildType(subProj_bt_1743_2)
    buildType(subProj_bt_1743_1)
    buildType(subProj_bt_1743_0)
    buildType(subProj_bt_1743_5)
})
