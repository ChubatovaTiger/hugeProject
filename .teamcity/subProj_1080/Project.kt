package subProj_1080

import subProj_1080.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1080")
    name = "subProj 1080"

    buildType(subProj_bt_1080_1)
    buildType(subProj_bt_1080_2)
    buildType(subProj_bt_1080_0)
    buildType(subProj_bt_1080_5)
    buildType(subProj_bt_1080_3)
    buildType(subProj_bt_1080_4)
})
