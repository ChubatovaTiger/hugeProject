package subProj_156

import subProj_156.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_156")
    name = "subProj 156"

    buildType(subProj_bt_156_0)
    buildType(subProj_bt_156_1)
    buildType(subProj_bt_156_2)
    buildType(subProj_bt_156_3)
    buildType(subProj_bt_156_4)
    buildType(subProj_bt_156_5)
})
