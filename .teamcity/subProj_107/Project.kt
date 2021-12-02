package subProj_107

import subProj_107.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_107")
    name = "subProj 107"

    buildType(subProj_bt_107_2)
    buildType(subProj_bt_107_3)
    buildType(subProj_bt_107_0)
    buildType(subProj_bt_107_1)
    buildType(subProj_bt_107_4)
    buildType(subProj_bt_107_5)
})
