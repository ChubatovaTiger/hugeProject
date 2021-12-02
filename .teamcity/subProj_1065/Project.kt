package subProj_1065

import subProj_1065.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1065")
    name = "subProj 1065"

    buildType(subProj_bt_1065_5)
    buildType(subProj_bt_1065_4)
    buildType(subProj_bt_1065_1)
    buildType(subProj_bt_1065_0)
    buildType(subProj_bt_1065_3)
    buildType(subProj_bt_1065_2)
})
