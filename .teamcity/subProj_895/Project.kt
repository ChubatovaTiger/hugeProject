package subProj_895

import subProj_895.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_895")
    name = "subProj 895"

    buildType(subProj_bt_895_4)
    buildType(subProj_bt_895_5)
    buildType(subProj_bt_895_0)
    buildType(subProj_bt_895_1)
    buildType(subProj_bt_895_2)
    buildType(subProj_bt_895_3)
})
