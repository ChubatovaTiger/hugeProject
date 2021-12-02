package subProj_1280

import subProj_1280.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1280")
    name = "subProj 1280"

    buildType(subProj_bt_1280_0)
    buildType(subProj_bt_1280_3)
    buildType(subProj_bt_1280_4)
    buildType(subProj_bt_1280_1)
    buildType(subProj_bt_1280_2)
    buildType(subProj_bt_1280_5)
})
