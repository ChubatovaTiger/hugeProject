package subProj_463

import subProj_463.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_463")
    name = "subProj 463"

    buildType(subProj_bt_463_5)
    buildType(subProj_bt_463_4)
    buildType(subProj_bt_463_3)
    buildType(subProj_bt_463_2)
    buildType(subProj_bt_463_1)
    buildType(subProj_bt_463_0)
})
