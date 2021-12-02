package subProj_580

import subProj_580.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_580")
    name = "subProj 580"

    buildType(subProj_bt_580_1)
    buildType(subProj_bt_580_2)
    buildType(subProj_bt_580_0)
    buildType(subProj_bt_580_5)
    buildType(subProj_bt_580_3)
    buildType(subProj_bt_580_4)
})
