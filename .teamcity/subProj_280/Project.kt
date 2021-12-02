package subProj_280

import subProj_280.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_280")
    name = "subProj 280"

    buildType(subProj_bt_280_1)
    buildType(subProj_bt_280_0)
    buildType(subProj_bt_280_5)
    buildType(subProj_bt_280_4)
    buildType(subProj_bt_280_3)
    buildType(subProj_bt_280_2)
})
