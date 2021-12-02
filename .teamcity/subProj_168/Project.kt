package subProj_168

import subProj_168.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_168")
    name = "subProj 168"

    buildType(subProj_bt_168_0)
    buildType(subProj_bt_168_1)
    buildType(subProj_bt_168_2)
    buildType(subProj_bt_168_3)
    buildType(subProj_bt_168_4)
    buildType(subProj_bt_168_5)
})
