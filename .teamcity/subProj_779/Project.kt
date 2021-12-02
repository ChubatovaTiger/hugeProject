package subProj_779

import subProj_779.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_779")
    name = "subProj 779"

    buildType(subProj_bt_779_4)
    buildType(subProj_bt_779_3)
    buildType(subProj_bt_779_5)
    buildType(subProj_bt_779_0)
    buildType(subProj_bt_779_2)
    buildType(subProj_bt_779_1)
})
