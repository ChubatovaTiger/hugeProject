package subProj_487

import subProj_487.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_487")
    name = "subProj 487"

    buildType(subProj_bt_487_5)
    buildType(subProj_bt_487_1)
    buildType(subProj_bt_487_2)
    buildType(subProj_bt_487_3)
    buildType(subProj_bt_487_4)
    buildType(subProj_bt_487_0)
})
