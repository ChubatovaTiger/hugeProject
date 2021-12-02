package subProj_1772

import subProj_1772.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1772")
    name = "subProj 1772"

    buildType(subProj_bt_1772_0)
    buildType(subProj_bt_1772_1)
    buildType(subProj_bt_1772_2)
    buildType(subProj_bt_1772_3)
    buildType(subProj_bt_1772_4)
    buildType(subProj_bt_1772_5)
})
