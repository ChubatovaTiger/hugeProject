package subProj_1608

import subProj_1608.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1608")
    name = "subProj 1608"

    buildType(subProj_bt_1608_5)
    buildType(subProj_bt_1608_4)
    buildType(subProj_bt_1608_3)
    buildType(subProj_bt_1608_2)
    buildType(subProj_bt_1608_1)
    buildType(subProj_bt_1608_0)
})
