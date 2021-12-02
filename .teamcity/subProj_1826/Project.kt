package subProj_1826

import subProj_1826.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1826")
    name = "subProj 1826"

    buildType(subProj_bt_1826_3)
    buildType(subProj_bt_1826_4)
    buildType(subProj_bt_1826_5)
    buildType(subProj_bt_1826_0)
    buildType(subProj_bt_1826_1)
    buildType(subProj_bt_1826_2)
})
