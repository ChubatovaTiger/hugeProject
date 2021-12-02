package subProj_840

import subProj_840.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_840")
    name = "subProj 840"

    buildType(subProj_bt_840_2)
    buildType(subProj_bt_840_3)
    buildType(subProj_bt_840_0)
    buildType(subProj_bt_840_1)
    buildType(subProj_bt_840_4)
    buildType(subProj_bt_840_5)
})
