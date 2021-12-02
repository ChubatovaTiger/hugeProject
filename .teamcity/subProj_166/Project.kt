package subProj_166

import subProj_166.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_166")
    name = "subProj 166"

    buildType(subProj_bt_166_0)
    buildType(subProj_bt_166_1)
    buildType(subProj_bt_166_2)
    buildType(subProj_bt_166_3)
    buildType(subProj_bt_166_4)
    buildType(subProj_bt_166_5)
})
