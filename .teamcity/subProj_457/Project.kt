package subProj_457

import subProj_457.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_457")
    name = "subProj 457"

    buildType(subProj_bt_457_0)
    buildType(subProj_bt_457_1)
    buildType(subProj_bt_457_4)
    buildType(subProj_bt_457_5)
    buildType(subProj_bt_457_2)
    buildType(subProj_bt_457_3)
})
