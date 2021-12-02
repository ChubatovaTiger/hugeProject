package subProj_251

import subProj_251.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_251")
    name = "subProj 251"

    buildType(subProj_bt_251_4)
    buildType(subProj_bt_251_5)
    buildType(subProj_bt_251_2)
    buildType(subProj_bt_251_3)
    buildType(subProj_bt_251_0)
    buildType(subProj_bt_251_1)
})
