package subProj_1844

import subProj_1844.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1844")
    name = "subProj 1844"

    buildType(subProj_bt_1844_0)
    buildType(subProj_bt_1844_2)
    buildType(subProj_bt_1844_1)
    buildType(subProj_bt_1844_4)
    buildType(subProj_bt_1844_3)
    buildType(subProj_bt_1844_5)
})
