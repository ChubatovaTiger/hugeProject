package subProj_999

import subProj_999.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_999")
    name = "subProj 999"

    buildType(subProj_bt_999_5)
    buildType(subProj_bt_999_4)
    buildType(subProj_bt_999_3)
    buildType(subProj_bt_999_2)
    buildType(subProj_bt_999_1)
    buildType(subProj_bt_999_0)
})
