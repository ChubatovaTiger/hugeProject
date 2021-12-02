package subProj_1156

import subProj_1156.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1156")
    name = "subProj 1156"

    buildType(subProj_bt_1156_4)
    buildType(subProj_bt_1156_3)
    buildType(subProj_bt_1156_2)
    buildType(subProj_bt_1156_1)
    buildType(subProj_bt_1156_5)
    buildType(subProj_bt_1156_0)
})
