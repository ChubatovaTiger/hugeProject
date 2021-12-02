package subProj_181

import subProj_181.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_181")
    name = "subProj 181"

    buildType(subProj_bt_181_3)
    buildType(subProj_bt_181_2)
    buildType(subProj_bt_181_5)
    buildType(subProj_bt_181_4)
    buildType(subProj_bt_181_1)
    buildType(subProj_bt_181_0)
})
