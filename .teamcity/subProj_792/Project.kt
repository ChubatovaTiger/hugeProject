package subProj_792

import subProj_792.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_792")
    name = "subProj 792"

    buildType(subProj_bt_792_2)
    buildType(subProj_bt_792_3)
    buildType(subProj_bt_792_0)
    buildType(subProj_bt_792_1)
    buildType(subProj_bt_792_4)
    buildType(subProj_bt_792_5)
})
