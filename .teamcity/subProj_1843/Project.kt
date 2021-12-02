package subProj_1843

import subProj_1843.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1843")
    name = "subProj 1843"

    buildType(subProj_bt_1843_1)
    buildType(subProj_bt_1843_0)
    buildType(subProj_bt_1843_3)
    buildType(subProj_bt_1843_2)
    buildType(subProj_bt_1843_5)
    buildType(subProj_bt_1843_4)
})
