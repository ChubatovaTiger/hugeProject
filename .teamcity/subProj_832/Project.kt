package subProj_832

import subProj_832.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_832")
    name = "subProj 832"

    buildType(subProj_bt_832_5)
    buildType(subProj_bt_832_0)
    buildType(subProj_bt_832_3)
    buildType(subProj_bt_832_4)
    buildType(subProj_bt_832_1)
    buildType(subProj_bt_832_2)
})
