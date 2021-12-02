package subProj_1971

import subProj_1971.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1971")
    name = "subProj 1971"

    buildType(subProj_bt_1971_4)
    buildType(subProj_bt_1971_5)
    buildType(subProj_bt_1971_0)
    buildType(subProj_bt_1971_1)
    buildType(subProj_bt_1971_2)
    buildType(subProj_bt_1971_3)
})
