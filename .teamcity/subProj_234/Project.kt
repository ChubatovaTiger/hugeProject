package subProj_234

import subProj_234.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_234")
    name = "subProj 234"

    buildType(subProj_bt_234_5)
    buildType(subProj_bt_234_2)
    buildType(subProj_bt_234_1)
    buildType(subProj_bt_234_4)
    buildType(subProj_bt_234_3)
    buildType(subProj_bt_234_0)
})
