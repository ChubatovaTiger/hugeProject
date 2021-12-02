package subProj_1613

import subProj_1613.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1613")
    name = "subProj 1613"

    buildType(subProj_bt_1613_2)
    buildType(subProj_bt_1613_1)
    buildType(subProj_bt_1613_0)
    buildType(subProj_bt_1613_5)
    buildType(subProj_bt_1613_4)
    buildType(subProj_bt_1613_3)
})
