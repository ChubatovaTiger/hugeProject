package subProj_1765

import subProj_1765.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1765")
    name = "subProj 1765"

    buildType(subProj_bt_1765_5)
    buildType(subProj_bt_1765_0)
    buildType(subProj_bt_1765_1)
    buildType(subProj_bt_1765_2)
    buildType(subProj_bt_1765_3)
    buildType(subProj_bt_1765_4)
})
