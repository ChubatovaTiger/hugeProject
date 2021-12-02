package subProj_1457

import subProj_1457.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1457")
    name = "subProj 1457"

    buildType(subProj_bt_1457_5)
    buildType(subProj_bt_1457_2)
    buildType(subProj_bt_1457_1)
    buildType(subProj_bt_1457_4)
    buildType(subProj_bt_1457_3)
    buildType(subProj_bt_1457_0)
})
