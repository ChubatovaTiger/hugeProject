package subProj_287

import subProj_287.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_287")
    name = "subProj 287"

    buildType(subProj_bt_287_5)
    buildType(subProj_bt_287_4)
    buildType(subProj_bt_287_3)
    buildType(subProj_bt_287_2)
    buildType(subProj_bt_287_1)
    buildType(subProj_bt_287_0)
})
