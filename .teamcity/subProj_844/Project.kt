package subProj_844

import subProj_844.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_844")
    name = "subProj 844"

    buildType(subProj_bt_844_4)
    buildType(subProj_bt_844_5)
    buildType(subProj_bt_844_2)
    buildType(subProj_bt_844_3)
    buildType(subProj_bt_844_0)
    buildType(subProj_bt_844_1)
})
