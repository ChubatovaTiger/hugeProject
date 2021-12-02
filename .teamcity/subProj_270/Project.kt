package subProj_270

import subProj_270.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_270")
    name = "subProj 270"

    buildType(subProj_bt_270_0)
    buildType(subProj_bt_270_5)
    buildType(subProj_bt_270_4)
    buildType(subProj_bt_270_3)
    buildType(subProj_bt_270_2)
    buildType(subProj_bt_270_1)
})
