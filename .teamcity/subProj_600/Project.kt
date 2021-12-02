package subProj_600

import subProj_600.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_600")
    name = "subProj 600"

    buildType(subProj_bt_600_2)
    buildType(subProj_bt_600_3)
    buildType(subProj_bt_600_4)
    buildType(subProj_bt_600_5)
    buildType(subProj_bt_600_0)
    buildType(subProj_bt_600_1)
})
