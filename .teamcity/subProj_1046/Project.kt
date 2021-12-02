package subProj_1046

import subProj_1046.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1046")
    name = "subProj 1046"

    buildType(subProj_bt_1046_5)
    buildType(subProj_bt_1046_1)
    buildType(subProj_bt_1046_2)
    buildType(subProj_bt_1046_3)
    buildType(subProj_bt_1046_4)
    buildType(subProj_bt_1046_0)
})
