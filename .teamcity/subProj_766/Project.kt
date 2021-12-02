package subProj_766

import subProj_766.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_766")
    name = "subProj 766"

    buildType(subProj_bt_766_5)
    buildType(subProj_bt_766_2)
    buildType(subProj_bt_766_1)
    buildType(subProj_bt_766_4)
    buildType(subProj_bt_766_3)
    buildType(subProj_bt_766_0)
})
