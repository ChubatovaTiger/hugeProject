package subProj_824

import subProj_824.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_824")
    name = "subProj 824"

    buildType(subProj_bt_824_3)
    buildType(subProj_bt_824_2)
    buildType(subProj_bt_824_5)
    buildType(subProj_bt_824_4)
    buildType(subProj_bt_824_1)
    buildType(subProj_bt_824_0)
})
