package subProj_1736

import subProj_1736.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1736")
    name = "subProj 1736"

    buildType(subProj_bt_1736_0)
    buildType(subProj_bt_1736_5)
    buildType(subProj_bt_1736_3)
    buildType(subProj_bt_1736_4)
    buildType(subProj_bt_1736_1)
    buildType(subProj_bt_1736_2)
})
