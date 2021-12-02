package subProj_1825

import subProj_1825.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1825")
    name = "subProj 1825"

    buildType(subProj_bt_1825_4)
    buildType(subProj_bt_1825_5)
    buildType(subProj_bt_1825_0)
    buildType(subProj_bt_1825_1)
    buildType(subProj_bt_1825_2)
    buildType(subProj_bt_1825_3)
})
