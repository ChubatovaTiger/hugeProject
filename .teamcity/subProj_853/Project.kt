package subProj_853

import subProj_853.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_853")
    name = "subProj 853"

    buildType(subProj_bt_853_1)
    buildType(subProj_bt_853_0)
    buildType(subProj_bt_853_5)
    buildType(subProj_bt_853_4)
    buildType(subProj_bt_853_3)
    buildType(subProj_bt_853_2)
})
