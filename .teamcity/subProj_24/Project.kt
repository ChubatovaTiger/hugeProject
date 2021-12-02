package subProj_24

import subProj_24.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_24")
    name = "subProj 24"

    buildType(subProj_bt_24_0)
    buildType(subProj_bt_24_1)
    buildType(subProj_bt_24_2)
    buildType(subProj_bt_24_3)
    buildType(subProj_bt_24_4)
    buildType(subProj_bt_24_5)
})
