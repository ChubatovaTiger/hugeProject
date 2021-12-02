package subProj_131

import subProj_131.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_131")
    name = "subProj 131"

    buildType(subProj_bt_131_5)
    buildType(subProj_bt_131_4)
    buildType(subProj_bt_131_3)
    buildType(subProj_bt_131_2)
    buildType(subProj_bt_131_1)
    buildType(subProj_bt_131_0)
})
