package subProj_22

import subProj_22.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_22")
    name = "subProj 22"

    buildType(subProj_bt_22_0)
    buildType(subProj_bt_22_1)
    buildType(subProj_bt_22_2)
    buildType(subProj_bt_22_3)
    buildType(subProj_bt_22_4)
    buildType(subProj_bt_22_5)
})
