package subProj_1207

import subProj_1207.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1207")
    name = "subProj 1207"

    buildType(subProj_bt_1207_5)
    buildType(subProj_bt_1207_4)
    buildType(subProj_bt_1207_3)
    buildType(subProj_bt_1207_2)
    buildType(subProj_bt_1207_1)
    buildType(subProj_bt_1207_0)
})
