package subProj_1707

import subProj_1707.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1707")
    name = "subProj 1707"

    buildType(subProj_bt_1707_5)
    buildType(subProj_bt_1707_2)
    buildType(subProj_bt_1707_1)
    buildType(subProj_bt_1707_4)
    buildType(subProj_bt_1707_3)
    buildType(subProj_bt_1707_0)
})
